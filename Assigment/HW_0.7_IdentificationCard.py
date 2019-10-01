
while True:
    try:
        ingreso = input("Ingrese su cedula: ")
        break
    except ValueError:
        print("Error, Ingrese los digitos de su cedula")

par= ingreso[0], ingreso[2], ingreso[4], ingreso[6], ingreso[8]
print(par)
impar= ingreso[1], ingreso[3], ingreso[5], ingreso[7], ingreso[9]

print(par[0])
print(par[1])

for i in par :
   i=par*2
   print(i)



