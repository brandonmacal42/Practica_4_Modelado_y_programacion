import java.util.*;

public class Fabrica extends ArmadoBuilder{


    public void agregarArma(){
        componentes.add(new ArmaLaserSimple());
    }

    public void agregarCabina(){
        componentes.add(new CabinaUnPiloto());

    }

    public void agregarBlindaje(){
        componentes.add(new BlindajeSimple());
    }

    public void agregarSistemaPropulsion(){
        componentes.add(new PropulsionIntercontinental());
    }

}