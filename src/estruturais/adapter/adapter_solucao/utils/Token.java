package  adapter.adapter_solucao.utils;

public class Token {

  private String token;

  public Token() {
    this.token =
        "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkRlc2luZy"
            + "BwYXR0ZXJucyIsImlhdCI6MTUxNjIzOTAyMn0.BoHtfOc_BNYDF8r61fz7R_OdXd07nLrZJoGezVY5uGU";
  }

  public String getToken() {
    return token;
  }
}
