
def doblar( numero ):
    return numero * 2
    
def imprimir2( funcion, numero ):
    print( funcion(numero) )
    
print(doblar(6))

imprimir2(doblar, 7)