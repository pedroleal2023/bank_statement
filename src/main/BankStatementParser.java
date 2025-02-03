package main;

import java.util.List;

public interface BankStatementParser {

    BankTransaction parseFrom(String statement);
    List<BankTransaction> parseListFrom(List<String> lines);

    void analyze(String arg, BankStatementParser bankStatementParser);
}
