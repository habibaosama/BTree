package lab5.search_engine;

public class SearchResult implements ISearchResult {

    private String id;
    private int rank;

    public SearchResult(String id, int rank) {
        this.id = id;
        this.rank = rank;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int getRank() {
        return rank;
    }

    @Override
    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Id: " + id + " rank: " + rank;
    }
}
