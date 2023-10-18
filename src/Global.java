import java.io.*;
class GetSimbolOfFile{
    public int i;
    public int[] buf = new int[10];

    public void getsimbol(String file)  throws IOException{

        FileInputStream fin = new FileInputStream(file);
        do{
            i = fin.read();
            int k=0;
            if (i!=-1){
                System.out.println((char)i);
                System.out.println(i);
                this.buf[k] = i;
                System.out.println(this.buf[k]);
            } else {
                this.buf[k] = 0;
            }

            k++;
        }while (i!=-1);

        fin.close();
    }


    public void setsimbol(String outf)  throws IOException{

        FileOutputStream fout = new FileOutputStream(outf);

        for(int i=0; (i<this.buf.length); i++) {
            System.out.println(this.buf[i]);
            fout.write(this.buf[i]);
        }

        fout.close();
    }

}
public class Global {
    public static void main(String[] args) throws FileNotFoundException
    {
        GetSimbolOfFile obj = new GetSimbolOfFile();
        System.out.println(obj.buf[1]);

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
