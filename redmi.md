#Функция расчитывает простые множетели числа и выводит список. Если число простое выводит сообщение об этом.
def ListPrimeFactorsNumber(num):
    list_mul = []
    i=2
    n=num
    while i*i<=num:
        while num % i==0:
                list_mul.append(i)
                num = num / i
        i = i + 1
    if num > 1:
            list_mul.append(int(num))
    if num == n:
        print (f"У числа {n} нет простых множителей, т.к. оно само является простым числом.")
        quit()
    return list_mul

n=int(input('Введите целое положительное число: '))
print (n, ' => ', ListPrimeFactorsNumber(n))