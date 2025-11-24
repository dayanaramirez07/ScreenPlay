package co.edu.udea.automatizacion.saucedemo.hooks;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hooks para configurar WebDriver antes de ejecutar las pruebas
 */
public class WebDriverHooks {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(WebDriverHooks.class);
    private static boolean isWebDriverSetup = false;

    /**
     * Configura WebDriverManager para gestionar automáticamente
     * la descarga e instalación de ChromeDriver
     * Se ejecuta solo una vez para todo el conjunto de pruebas
     */
    @Before(order = 0)  // Se ejecuta primero, antes de otros @Before
    public void setupWebDriver() {
        if (!isWebDriverSetup) {
            LOGGER.info("[SETUP] Configurando WebDriverManager para ChromeDriver...");
            try {
                WebDriverManager.chromedriver().clearDriverCache().setup();
                isWebDriverSetup = true;
                LOGGER.info("[SUCCESS] ChromeDriver configurado correctamente");
            } catch (Exception e) {
                LOGGER.error("[ERROR] Error configurando ChromeDriver: {}", e.getMessage());
                throw new RuntimeException("No se pudo configurar ChromeDriver", e);
            }
        }
    }
}
