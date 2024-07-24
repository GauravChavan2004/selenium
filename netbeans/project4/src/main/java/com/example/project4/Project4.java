/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.example.project4;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import jxl.*;
import jxl.read.*;
import jxl.write.*;
import java.io.*;

/**
 *
 * @author HP
 */
public class Project4 {
    @BeforeClass
    public void f1(){}
    @Text
    public void textImportexport1() throws Exception{
        //File Input of Excel
        FileInputStream fi=new FileInputStream("");
        workbook w=Workbook.getWorkbook(fi);
        Sheet s-w.getSheet(0);
        String a[][]=new String[s.getRows()][s.getColumns()];
        //Excel Output file
        FileOutputStreamfo=new FileOutputStream("");
        WritableWorkbookwwb=Workbook.createWorkbook(fo);
        WritableSheetws=wwb.createSheet("result1",0);
        for(int i=0;i<s.getRows();i++)
            for(int j=0;j<s.getColumns();j++){
            a[i][j]=s.getCell(j,i).getContents();
            Label 12=new Label(j,i,a[i][j]);
            ws.addcell(12);
            Label l1=new Label(6,0,"Result");
            ws.addCell(l1);
            }
        for(int i=1;i<s.getRows();i++){
            for(int j=2;j<s.getColumns();j++){
                a[i][j]=s.getCell(j,i).getContents();
                int x=Integer.parseInt(a[i][j]);
                if(x>35){
                    Label l1=new Label(6,i,"pass")
                            ws.addCell(l1);
               }
                else{
                    Label l1=new Label(6,i,"fail");
                    ws.addCell(l1);
                    break;
                }
            }
        }
        wwb.write();
        wwb.close();   
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
