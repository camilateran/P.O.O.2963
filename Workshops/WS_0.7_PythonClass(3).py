#posiciones [0:3]
#[-1] desde el final

#FUNCIONES CON ITERABLES
def pares(lista):
    return all(number%2 == 0 for numbre in lista)

def algunpar (lista):
    return any(number %2 == 0 for number in lista)

def my_filter (my_filter_fun, my_list):
    result =[]
    for item in my_list:
        if my_filter_m(item) is True:
            result.append(item)
    return result


def my_map(my_map_func, my_list):
    result=[]
    for item in my_list:
        result.append(my_map_func(item))
    return result

def my_printer(value):
    print(f'my printer : {value}')

def my_printer_applyer(printer_func, value):
    printer_func(value)


lsita= [2,4,6,9]
number_list_str = ['2','4','6','11']
#print(pares(lsita))
#print(algunpar(lsita))

#even_number= list(filter(even, lsita))
#even_number = list(my_filter(even,lsita)
#even_number = list(filter(lambda num: num%2 ==0, lista))

my_printer_applyer(my_printer,"hola")
my_printer_applyer(print, "hola")