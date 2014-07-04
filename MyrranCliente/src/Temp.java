import com.badlogic.ashley.core.Engine;
import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.signals.Listener;
import com.badlogic.ashley.signals.Signal;

public class Temp
{

    public void pim ()
    {
        Engine engine = new Engine();
        Entity entity = new Entity();

        Signal<String> signal = new Signal<>();

        Listener<String> listener = new Listener<String>()
        {
            @Override public void receive(Signal signal, String object)
            {
                System.out.println("RECIBIDO");
            }
        };

        signal.add(listener);
        signal.dispatch("hola");

    }
}
