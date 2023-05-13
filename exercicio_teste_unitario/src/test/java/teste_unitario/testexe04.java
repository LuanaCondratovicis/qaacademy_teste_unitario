package teste_unitario;

import org.junit.Test;
import org.junit.Assert;

public class testexe04 {
    @Test
    public void validaFrase(){
    Assert.assertEquals("Luana",exe04.inserirFrase());
}

}