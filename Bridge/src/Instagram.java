public class Instagram implements App{
    PhoneOS os;
     public Instagram(PhoneOS os){
         this.os=os;
     }


    @Override
    public void runApp() {
        System.out.println();
        os.display("cached data");
        os.upload("Upload to instagram.com");
        os.display("instagram.com");
        os.display("fresh data");
        System.out.println();
    }
}
