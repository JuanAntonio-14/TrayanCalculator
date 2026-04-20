<div align="center">


# Calculadora Java — Proyecto Colaborativo

**1º DAM · Entornos de Desarrollo · I.E.S. Francisco Rodríguez Marín**

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=java&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=flat&logo=git&logoColor=white)
![GitHub Actions](https://img.shields.io/badge/GitHub_Actions-2088FF?style=flat&logo=github-actions&logoColor=white)
![JUnit](https://img.shields.io/badge/JUnit-25A162?style=flat&logo=junit5&logoColor=white)

</div>

---

## Descripción del proyecto

Este proyecto consiste en una **calculadora en Java** con las cuatro operaciones matemáticas básicas: suma, resta, multiplicación y división. Ha sido desarrollado de forma colaborativa aplicando control de versiones con Git y GitHub, como parte de la actividad 4.1 del módulo de Entornos de Desarrollo.

---

## Funcionalidades

| Operación | Método | Desarrollado por |
|---|---|---|
| ➕ Suma | `sumar(a, b)` | José Ortega Delgado |
| ➖ Resta | `restar(a, b)` | José Ortega Delgado |
| ✖️ Multiplicación | `multiplicar(a, b)` | Juan Antonio Leiva Chía |
| ➗ División | `dividir(a, b)` | Juan Antonio Leiva Chía |

---

## Estructura de ramas

| Rama | Descripción |
|---|---|
| `main` | Versión estable y fusionada del proyecto |
| `jose` | Suma y resta · José Ortega Delgado |
| `juanantonio` | Multiplicación y división · Juan Antonio Leiva Chía |

Cada alumno ha trabajado en su propia rama y, una vez finalizadas las funcionalidades, se han fusionado con `main` manteniendo el historial completo de commits.

---

## Integración continua

El repositorio cuenta con un workflow de **GitHub Actions** que ejecuta automáticamente los tests con **JUnit** cada vez que se realiza un push o pull request en cualquiera de las ramas:

```yaml
on: [push, pull_request]
jobs:
  test:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v3
      - name: Set up JDK
        uses: actions/setup-java@v3
        with:
          java-version: '17'
      - name: Run JUnit tests
        run: mvn test
```

---

## Autores

| Nombre | Rol |
|---|---|
| **José Ortega Delgado** | Desarrollador — Suma y Resta |
| **Juan Antonio Leiva Chía** | Desarrollador — Multiplicación y División |

**Tutor:** Manuel Lora Navarro

---

## Acerca del proyecto — *Bombero Máximo Trayan: El Brazo del Perdón en Busca del Amor*

<div align="center">


</div>

Este proyecto nació bajo la sombra de una leyenda. **Bombero Máximo Trayan**, conocido en el barrio como *"El Brazo del Perdón"*, no solo apaga incendios: apaga odios, rencores y facturas sin pagar. Después de años enfrentándose a llamas que consumían edificios enteros con una simple manguera y una mirada de acero, Máximo descubrió que el fuego más difícil de extinguir era el del corazón.

Un día, entre escombros y cenizas, encontró una calculadora rota. Y fue entonces cuando lo comprendió todo: la vida, como las matemáticas, necesita equilibrio. **Suma esfuerzo, resta el ego, multiplica el amor y divide las responsabilidades.** Con esa filosofía grabada a fuego en el alma, Máximo —junto a sus fieles compañeros José y Juan Antonio— decidió llevar esa sabiduría al mundo del software.

El resultado: esta calculadora en Java. Una obra maestra de cuatro operaciones que haría llorar hasta al compilador. Próximamente en todos los repositorios.

> *"Clasificación: Apto para todos los públicos con conocimientos básicos de Git."*

---

<div align="center">

© 2025 José Ortega Delgado & Juan Antonio Leiva Chía · IES Francisco Rodríguez Marín, Osuna (Sevilla)

</div>
