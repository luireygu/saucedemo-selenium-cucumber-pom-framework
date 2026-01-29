__🚀 Proyecto de Automatización Web – Selenium + Cucumber + POM__


Este repositorio contiene un framework de automatización web desarrollado en Java, utilizando Selenium WebDriver, Cucumber (BDD), JUnit y Gradle, aplicando buenas prácticas de Page Object Model (POM) y una arquitectura escalable y mantenible.
El proyecto fue construido como un reto práctico para consolidar conocimientos de automatización y está pensado para ser presentable en entrevistas técnicas y utilizable en proyectos reales.    



__🧠 Objetivo del proyecto__


Automatizar el flujo de login exitoso y escenarios asociados en una aplicación web de ejemplo (SauceDemo).
Aplicar el patrón Page Object Model con separación clara de responsabilidades.
Usar Cucumber + Gherkin para pruebas legibles por perfiles técnicos y no técnicos.
Construir un framework limpio, escalable y mantenible.


__🛠️ Tecnologías utilizadas__

    Java 
    Selenium WebDriver
    Cucumber (BDD)
    JUnit
    Gradle
    WebDriverManager
    Page Object Model (POM)

__🗂️ Estructura del proyecto__

<img width="604" height="346" alt="image" src="https://github.com/user-attachments/assets/6de3f5b4-9d69-4828-96cd-da1ecee15099" />


__🧩 Arquitectura aplicada__

  🔹 Page Object Model (POM)
      Pages: representan pantallas completas y manejan navegación.
      Components: encapsulan bloques reutilizables de UI.
      Locators: centralizan los selectores para facilitar mantenimiento.
      Steps: orquestan el flujo del escenario, sin lógica de UI.

  🔹 Driver Management
      DriverFactory gestiona el ciclo de vida del navegador.
      Uso de ThreadLocal<WebDriver> para escalabilidad futura.
      Configuración del navegador desacoplada de las pruebas.

 __⚙️ Configuración__ 
      Archivo config.properties:  
        browser=chrome  
        baseUrl=https://www.saucedemo.com/  
        maximize=true        
        El framework soporta fácilmente múltiples navegadores.  

__👤 Autor__
    Luis Reyes QA Automation Engineer

__💬 Este proyecto fue desarrollado como ejercicio práctico para fortalecer habilidades en automatización de pruebas web y buenas prácticas de diseño de frameworks.__
