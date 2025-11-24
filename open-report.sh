#!/bin/bash

# Script para abrir el reporte de Serenity BDD

REPORT_PATH="build/reports/serenity/index.html"

if [ -f "$REPORT_PATH" ]; then
    echo "Reporte encontrado: $REPORT_PATH"
    echo ""
    
    # Detectar sistema operativo y abrir
    if [[ "$OSTYPE" == "msys" ]] || [[ "$OSTYPE" == "win32" ]]; then
        # Windows
        start "$REPORT_PATH"
    elif [[ "$OSTYPE" == "darwin"* ]]; then
        # macOS
        open "$REPORT_PATH"
    else
        # Linux
        xdg-open "$REPORT_PATH"
    fi
    
    echo "Reporte abierto en el navegador"
else
    echo "Reporte no encontrado en: $REPORT_PATH"
    echo ""
    echo "Ejecuta primero:"
    echo "./gradlew clean test"
    exit 1
fi
