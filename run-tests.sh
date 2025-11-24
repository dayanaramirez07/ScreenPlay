#!/bin/bash

# Script completo para ejecutar pruebas y generar reportes
# Uso: ./run-tests.sh

echo "EJECUCIÓN COMPLETA DE PRUEBAS SERENITY BDD"
echo "=============================================="
echo ""

# Paso 1: Ejecutar pruebas
echo "Paso 1/2: Ejecutando pruebas..."
./gradlew test --no-daemon

TEST_EXIT_CODE=$?

if [ $TEST_EXIT_CODE -eq 0 ]; then
    echo "Pruebas ejecutadas exitosamente"
else
    echo "Algunas pruebas fallaron (exit code: $TEST_EXIT_CODE)"
    echo "Continuando con generación de reportes..."
fi

echo ""

# Paso 2: Generar reportes
echo "Paso 2/2: Generando reportes HTML..."
mvn serenity:aggregate --no-daemon

AGGREGATE_EXIT_CODE=$?

echo ""

# Verificar resultados
if [ -f "build/reports/serenity/index.html" ]; then
    FILE_SIZE=$(du -h "build/reports/serenity/index.html" | cut -f1)
    echo "=============================================="
    echo "ÉXITO: Reporte generado"
    echo "=============================================="
    echo ""
    echo "Archivo: build/reports/serenity/index.html"
    echo "Tamaño: $FILE_SIZE"
    echo ""
    echo "Para abrir el reporte:"
    echo "Windows: start build/reports/serenity/index.html"
    echo "Mac:     open build/reports/serenity/index.html"
    echo "Linux:   xdg-open build/reports/serenity/index.html"
    echo ""
    exit 0
else
    echo "=============================================="
    echo "ERROR: Reporte no generado"
    echo "=============================================="
    echo ""
    echo "Los JSONs están en: target/site/serenity/"
    echo ""
    echo "Intenta generar manualmente:"
    echo "mvn serenity:aggregate"
    echo ""
    exit 1
fi
