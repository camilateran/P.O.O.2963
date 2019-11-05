#CI:
 
def validacionCI(ingreso):
    longitud = len(ingreso)
    if longitud == 10:
        codeProvince = int(ingreso[0:2])
        if codeProvince >= 1 and codeProvince <= 24:
            thirdDigit = int(ingreso[2])
            if thirdDigit >= 0 and thirdDigit < 6:
                if longitud == 10:
                    return CI(ingreso)
            else:
                raise Exception(u'Tercer digito invalido')
        else:
            raise Exception(u'Codigo de provincia incorrecto')
    else:
        raise Exception(u'Longitud incorrecta del numero ingresado')   

def CI(ingreso):
    mult=(2,1,2,1,2,1,2,1,2)
    sumaDigitos=0
    cedula=int(ingreso)
    for i in range(0,9):
        multDigitos=int(ingreso[i])*(mult[i])
        if (multDigitos >= 10):
            multDigitos-=9
        sumaDigitos += multDigitos
        
    decenaProxima = sumaDigitos+ (10-(sumaDigitos%10))
    digitoVerificador= decenaProxima-sumaDigitos
 
    if int(ingreso[9]) == digitoVerificador:
        print("--Cedula valida--")
    else:
        print("--Cedula no valida--")
#ingreso = input("Ingrese su cedula: ")        
validacionCI(input("Ingrese su cedula-> "))   