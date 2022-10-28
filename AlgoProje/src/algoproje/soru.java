
package algoproje;

import java.io.*;


public class soru {
    String[][]sorular;
    public void soruoku(int soruSayisi) throws IOException{
        sorular=new String[soruSayisi][6];
    File soruFile=new File("sorular.txt");
    if(!soruFile.exists()){
        soruFile.createNewFile();
        
    }
    FileReader fr1=new FileReader(soruFile);
    BufferedReader br1=new BufferedReader(fr1);
    String line="";
    
        for (int j = 0; j < soruSayisi; j++) {
            
            for (int k = 0; k < 6; k++) {
                line=br1.readLine();
                sorular[j][k]=line;
                line="";
            }
        }
        br1.close();
        
        
}
    public static void main(String[] args) throws IOException {
        soru ss1=new soru();
        ss1.soruoku(5);
        String sorusoru[][]=ss1.sorular;
        for (int i = 0; i < sorusoru.length; i++) {
            for (int j = 0; j < sorusoru[0].length; j++) {
                System.out.println(sorusoru[i][j]);
            }
            
        }
        
    }
}
