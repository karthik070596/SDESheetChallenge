public class darkcomponentfactory implements themecomponentfactory{
    @Override
    public button createbutton() {
        return new darkbutton();
    }

    @Override
    public dropdown createdropdown() {
        return new darkdropdown();
    }

    @Override
    public menu createmenu() {
        return new darkmenu();
    }
}
