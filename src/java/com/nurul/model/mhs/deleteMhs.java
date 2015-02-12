/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nurul.model.mhs;

import com.nurul.util.dbUtil;
import static com.opensymphony.xwork2.Action.ERROR;
import com.opensymphony.xwork2.ActionSupport;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nurul apriyani
 */
public class deleteMhs extends ActionSupport {
    private String id;
    public String execute(){
        dbUtil db= new dbUtil();
                
        Connection con= db.getConnection();
        String stat= ERROR;
        try {
            Statement st= con.createStatement();
            st.executeUpdate("DELETE FROM tbl_mhs WHERE id="+this.getId());
            stat=SUCCESS;
        }catch(SQLException ex){
            Logger.getLogger(listMhs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stat;
    }
    public String getId()
    {
        return this.id;
    }
    public void setId(String id)
    {
        this.id=id;
    }
    
}
