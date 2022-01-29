public class Workflow {
    private Searcher searcher = new TextSearcher();
    private String line;

    public Workflow(String line) {
        this.line = line;
    }

    public void findAllPatterns() {
        searcher.findMobilePhone(line);
        searcher.findEmail(line);
    }
}
