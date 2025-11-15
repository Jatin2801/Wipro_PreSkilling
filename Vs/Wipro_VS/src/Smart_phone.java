public class Smart_phone {
    public static void main(String[] args) {
        smrtph iphone = new smrtph();
        iphone.makecall();
        iphone.click_photo();
    }
}

interface camera {
void click_photo();
}

interface phone {
void makecall();
    
}

class smrtph implements camera,phone{
    
    public void click_photo() {
        System.out.println("It clicked photo");
    }
    public void makecall(){
        System.out.println("Makes call");
    }
}