package repository;

import model.Ground;

import java.util.List;

public interface IGroundRepos {
    List<Ground> selectAllGround();
    Ground selectGroundById();
    boolean insertGround();
    boolean updateGround();
    boolean deleteGround();
}
