import java.io.*;
class GetSimbolOfFile{
    public int i;
    public int[] buf = new int[100];

    public void getsimbol(String file)  throws IOException{
        try {
            FileInputStream fin = new FileInputStream(file);
            int k=0;
            do{
                i = fin.read();

                if (i!=-1){
                    this.buf[k] = i;
                } else {
                    this.buf[k] = 0;
                }
                k++;
            }while (i!=-1);

                try {
                    fin.close();
                } catch (Exception e){
                    System.out.println("Возникли проблемы с закрытием файла");
                }

        } catch (Exception e){
            System.out.println("Возникли проблемы с открытием файла");
        }

    }

    public void setsimbol(String outf)  throws IOException{
        try{
            FileOutputStream fout = new FileOutputStream(outf);
            for(int i=0; (i<this.buf.length); i++) {
                if(this.buf[i]!=0){
                    fout.write(this.buf[i]);
                }
            }
            try {
                fout.close();
            } catch (Exception e){
                System.out.println("Возникли проблемы с закрытием файла");
            }
        } catch (Exception e){
            System.out.println("Возникли проблемы с открытием файла");
        }
    }
}
public class Global {
    public static void main(String[] args) throws FileNotFoundException
    {
        GetSimbolOfFile obj = new GetSimbolOfFile();

        try{
            obj.getsimbol("D:\\bcb\\text.txt");
        } catch (IOException e){
            System.out.println("Возникли проблемы при работе с файлом");
        }

        try{
            obj.setsimbol("D:\\bcb\\out.txt");
        } catch (IOException e){
            System.out.println("Возникли проблемы при работе с файлом");
        }

    }
}
