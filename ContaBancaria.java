public class ContaBancaria{
    private int numeroConta;
    private String tipoConta;
    private String nomeCliente;
    private float saldoConta = 0;
    private boolean ativo = false;

    String poupanca;
    String corrente;

    public void abrirConta(int numeroConta, String tipoConta, String nomeCliente){
        /* this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.nomeCliente = nomeCliente;

        ativo = true; */

        if (tipoConta == "Conta corrente") {
            this.setSaldoConta(getSaldoConta() + 100);
        
        }else if (tipoConta == "Conta poupança"){
            this.setSaldoConta(getSaldoConta() + 150);
        }

        this.setAtivo(true);
        System.out.println("Conta ativada");

    }

    public void fecharConta(){
        if (this.getSaldoConta() != 0) {
            System.out.println("Não foi possível encerrar a conta");
        }else{
            this.setAtivo(false);
            System.out.println("Conta encerrada");
        }
        
        
    }


    public void depositarDinheiro(float valorDeposito) {
        this.setSaldoConta(this.getSaldoConta() + valorDeposito);;
    }

    public void sacarDinheiro(float valorSaque) {
        if (getSaldoConta() >= valorSaque) {
            setSaldoConta(this.getSaldoConta() - valorSaque);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void pagarManutencaoConta() {
        if (this.getTipoConta() == "Conta corrente") {
            this.setSaldoConta(this.getSaldoConta() - 13);
        }else{
            this.setSaldoConta(this.getSaldoConta() - 22);
        }
    }

    public void mostrarStatus(){
        System.out.println("Cliente: " + this.getNomeCliente());
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Saldo: " + this.getSaldoConta());
        System.out.println("Conta ativa?: " + this.isAtivo());

    } 

    //getter e setter

    //numeroConta

    public void setNumConta(int num){
        this.numeroConta = num;
    }

    public int getNumConta(){
        return this.numeroConta;
    }

    
    //tipoConta

    public void setTipoConta(String tipo){
        this.tipoConta = tipo;
    }

    public String getTipoConta(){
        return this.tipoConta;
    }

    //nomeCliente

    public void setNomeCliente(String nome){
        this.nomeCliente = nome;
    }

    public String getNomeCliente(){
        return this.nomeCliente;
    }

    //saldoConta

    public void setSaldoConta(Float saldo){
        this.saldoConta = saldo;
    }

    public float getSaldoConta(){
        return this.saldoConta;
    }

    //status

    public void setAtivo(Boolean status){
        this.ativo = status;
    }

    public boolean isAtivo(){ //tipo boolean o get é is
        return this.ativo;
    }

    //construtores
    public ContaBancaria(int numeroConta, String tipoConta, String nomeCliente){
		this.setNumConta(numeroConta);
        this.setTipoConta(tipoConta);
        this.setNomeCliente(nomeCliente);
        this.setSaldoConta(0f);
        this.setAtivo(false);


	}



}

    

