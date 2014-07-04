import com.badlogic.gdx.Screen;

public class PantallaLibGDX implements Screen
{
    public PantallaLibGDX(MyrranCliente game)
    {   Settings.init();
        Settings.settings.setInt("resolucionHorizontal", 1800);
        Settings.settings.saveSettings();
    }

    @Override
    public void render(float delta)
    {

    }

    @Override
    public void resize(int width, int height)
    {

    }

    @Override
    public void show()
    {

    }

    @Override
    public void hide()
    {

    }

    @Override
    public void pause()
    {

    }

    @Override
    public void resume()
    {

    }

    @Override
    public void dispose()
    {

    }
}
