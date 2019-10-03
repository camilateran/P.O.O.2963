#MAP

def cuadrada(numero):
    return numero**2

def my_map (cuadrada,lista):
    lista_nueva=[]
    for i in lista:
        lista_nueva.append(cuadrada(i))
    return lista_nueva


if __name__ == "__main__":
    
    lista= [1,2,3,4]
    c = my_map(cuadrada,lista)
    print(c)


    
