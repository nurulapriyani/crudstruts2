/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nurul.model.mhs;

import com.nurul.util.dbUtil;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
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
public class editMhs {
    private String id;
    private String nama;
    private String npm;
    private String tgl_lahir;
    private String jk;
    private String alamat;
    private String msg;
    private String edt;
    
    public String execute(){
        dbUtil db= new dbUtil();
        Connection con= db.getConnection();
        String stat= ERROR;
        
        if(edt!=null){
            try {
                if(getNpm()!=null&&getTgl_lahir()!=null&&getJk()!=null&&getAlamat()!=null&&getNama()!=null&&getId()!=null)
                {
                    Statement st= con.createStatement();
                    st.executeUpdate("UPDATE tbl_mhs SET npm='"+getNpm()+"',nama='"+getNama()+"',tgl_lahir='"+getTgl_lahir()+"',jk='"+getJk()+"',alamat='"+getAlamat()+"' WHERE id="+getId());
                    stat=SUCCESS;
                    msg="1 record edied";
                }
            }catch(SQLException ex){
                Logger.getLogger(listMhs.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                if(getId()!=null)
                {
                    Statement st= con.createStatement();
                
                    ResultSet rs=st.executeQuery("SELECT * FROM tbl_mhs WHERE id="+getId());
                    while(rs.next()){
                     setId(rs.getString("id"));
                     setNama(rs.getString("nama"));
                     setNpm(rs.getString("npm"));
                     setTgl_lahir(rs.getString("tgl_lahir"));
                     setJk(rs.getString("jk"));
                     setAlamat(rs.getString("alamat"));
                    }
                    stat=SUCCESS;
                }
            }catch(SQLException ex){
                Logger.getLogger(listMhs.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return stat;
    }
    public void setId(String id)
    {
        this.id=id;
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
    public String getId()
    {
        return this.id;
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
    public String getEdt()
    {
        return this.edt;
    }
    public void setEdt(String edt)
    {
        this.edt=edt;
    }
    public String getMsg()
    {
        return this.msg;
    }
}
