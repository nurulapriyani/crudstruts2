/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nurul.model.mhs;

import com.nurul.util.dbUtil;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nurul apriyani
 */
public class addMhs extends ActionSupport{
    private String nama;
    private String npm;
    private String tgl_lahir;
    private String jk;
    private String alamat;
    private String msg;
    
    public String execute(){
        dbUtil db= new dbUtil();
                
        Connection con= db.getConnection();
        String stat= ERROR;
        try {
            if(getNpm()!=null&&getTgl_lahir()!=null&&getJk()!=null&&getAlamat()!=null&&getNama()!=null)
            {
                Statement st= con.createStatement();
                st.executeUpdate("INSERT INTO tbl_mhs VALUES(0,'"+getNpm()+"','"+getNama()+"','"+getTgl_lahir()+"','"+getJk()+"','"+getAlamat()+"')");
                stat=SUCCESS;
                msg="1 record added";
            }
        }catch(SQLException ex){
            Logger.getLogger(listMhs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stat;
    }
    public void setNama(String nama)
    {
        this.nama=nama;
    }
    public void setNpm(String npm)
    {
        this.npm=npm;
    }
    public void setTgl_lahir(String tgl_lahir)
    {
        this.tgl_lahir=tgl_lahir;
    }
    public void setJk(String jk)
    {
        this.jk=jk;
    }
    public void setAlamat(String alamat)
    {
        this.alamat=alamat;
    }
    public String getNama()
    {
        return this.nama;
    }
    public String getNpm()
    {
        return this.npm;
    }
    public String getTgl_lahir()
    {
        return this.tgl_lahir;
    }
    public String getJk()
    {
        return this.jk;
    }
    public String getAlamat()
    {
        return this.alamat;
    }
    public String getMsg()
    {
        return this.msg;
    }
    
}
