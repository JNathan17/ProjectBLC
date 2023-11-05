import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IBalanca<Produto> balanca;
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto());


        balanca = BalanceFactory.getBalanca(TipoBalanca.TOLEDO_MGV6);
        assert balanca != null;
        balanca.exportar(produtos, "D:\\FACULDADE\\Paradigmas\\atividade1_nota2\\bdtxt");

        balanca = BalanceFactory.getBalanca(TipoBalanca.FILIZOLA_SMART);
        assert balanca != null;
        balanca.exportar(produtos, "D:\\FACULDADE\\Paradigmas\\atividade1_nota2\\bdtxt");

        balanca = BalanceFactory.getBalanca(TipoBalanca.URANO_INTEGRA);
        assert balanca != null;
        balanca.exportar(produtos, "D:\\FACULDADE\\Paradigmas\\atividade1_nota2\\bdtxt");
    }
}