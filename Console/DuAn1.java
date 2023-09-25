import java.util.Base64;
import java.util.Scanner;

public class DuAn1{
    
    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
        
         do{
       // chuỗi gốc tự nhập từ bàn phím

        System.out.println("Nhap password: ");
        
         String originalPassWord=scanner.nextLine();
        System.out.println("Original password: "+originalPassWord);
       
        byte [] encodedPassWord=Base64.getEncoder().encode(originalPassWord.getBytes());
        System.out.println("EncoderPassword: "+new String(encodedPassWord));
        
        byte [] decodedPassWord=Base64.getDecoder().decode(encodedPassWord);
        System.out.println("DecoderPassword: "+new String(decodedPassWord));
       
        System.out.println("Ban muon thoat yes/no !");
            String nhap=scanner.nextLine();
            if(nhap.equalsIgnoreCase("yes")){
                System.out.println("-----Thoat !");
                break;
            }
         }while(true);
        
    }
}