package hello.control;

import hello.model.StockAccountUser;

public class UserFindByBanker {
    private int status;
    private StockAccountUser user;

    public UserFindByBanker(int status, StockAccountUser user) {
        this.status = status;
        this.user = user;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public StockAccountUser getUser() {
        return user;
    }

    public void setUser(StockAccountUser user) {
        this.user = user;
    }
}
