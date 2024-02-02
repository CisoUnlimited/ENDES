package testing;

import helper.Comun;
import helper.Util;

import java.io.IOException;

public class DescargarPDFs {
    public static void main(String[] args) {

        try {
            Comun.descargarPDFs(Util.URL,args[0]);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
