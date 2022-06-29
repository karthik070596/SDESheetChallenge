public class main {
    public static void main(String[] args) {
        theme t=new darktheme();
        themecomponentfactory component=t.createtheme();
        button b=component.createbutton();
        dropdown d=component.createdropdown();
        menu m=component.createmenu();
        b.messagebutton();
        d.dropmessage();
        m.messagemenu();

    }
}
