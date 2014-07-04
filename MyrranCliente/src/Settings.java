import com.badlogic.gdx.utils.Logger;

public class Settings
{
    //LibGDX:
    public static int resolucionHorizontal;
    public static int resolucionVertical;

    private static Logger logger = new Logger("Settings", Logger.INFO);
    public static SettingsLoader settings;

    public static void init()
    {
        //logger.info("inicializado");

        settings = new SettingsLoader("Settingos.xml");

        resolucionHorizontal = settings.getInt("resolucionHorizontal", 1600);
        resolucionVertical = settings.getInt("resolucionVertical", 1200);
    }
}
