

/**
 *
 * @author GATEWAY
 */
class ContaTipoA {
    public int i;
    private int j;
    
}
class ContaTipoB extends ContaTipoA{
    void imprimo(){
    super.j = super.i + 1;
        System.out.println(super.i + "" + super.j);
    }
}
class Principal{
    public static void main(String[] args) {
        ContaTipoBobj = new ContaTipoB();
        obj.i-1;
        obj.imprimo();
    }
}
