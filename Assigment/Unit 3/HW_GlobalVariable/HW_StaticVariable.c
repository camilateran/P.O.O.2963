void funtion();
int a, b = 20;
 
int main()
{
    funtion();
    funtion();
    return 0;
}
 
void funtion()
{
    int a = 1;
    static int b = 100;
    printf("a = %d\n", a);
    printf("b = %d\n\n", b);
    a++;
    b++;
}
