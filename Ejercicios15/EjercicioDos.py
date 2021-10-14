#datos de entrada
horas = float(input("Introduce tus horas de trabajo: "))
cobro = float(input("Introduce lo que cobras por hora: "))
horExcedida=horas - 40
print("Sus horas exedidas es", horExcedida)
#proceso
if horas <= 40:
   paga = horas * cobro
   
else: horas > 40
paga = (40 * cobro) +  (horExcedida* (cobro*2))
#Datos de salida
print("Tu paga es", paga)
