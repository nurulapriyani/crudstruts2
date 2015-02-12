/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nurul.model.mhs;

import com.nurul.util.dbUtil;
import com.opensymphony.xwork2.ActionSupport;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nurul apriyani
 */
public class listMhs extends ActionSupport {
   
    private ArrayList<mhs> mhss; 
    
    public String execute() {
        dbUtil db= new dbUtil();
                
        Connection con= db.getConnection();
        String stat= ERROR;
        try {
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery("SELECT * FROM tbl_mhs");
            this.mhss=new ArrayList<mhs>(); 
            while(rs.next()){
                mhs mh= new mhs();
                 mh.setId(rs.getString("id"));
                 mh.setNama(rs.getString("nama"));
                 mh.setNpm(rs.getString("npm"));
                 mh.setTgl_lahir(rs.getString("tgl_lahir"));
                 mh.setJk(rs.getString("jk"));
                 mh.setAlamat(rs.getString("alamat"));
                 mhss.add(mh);
            }
             stat=SUCCESS;
        } catch (SQLException ex) {
            Logger.getLogger(listMhs.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return stat;
    }
    public void setMhss(ArrayList mhss)
    {
        this.mhss=mhss;
    }
     public ArrayList getMhss()
    {
        return this.mhss;
    }
     
}
