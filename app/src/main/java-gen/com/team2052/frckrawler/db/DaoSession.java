package com.team2052.frckrawler.db;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 *
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig gameDaoConfig;
    private final DaoConfig eventDaoConfig;
    private final DaoConfig teamDaoConfig;
    private final DaoConfig userDaoConfig;
    private final DaoConfig metricDaoConfig;
    private final DaoConfig matchDaoConfig;
    private final DaoConfig matchDataDaoConfig;
    private final DaoConfig matchCommentDaoConfig;
    private final DaoConfig robotDaoConfig;
    private final DaoConfig robotEventDaoConfig;
    private final DaoConfig pitDataDaoConfig;

    private final GameDao gameDao;
    private final EventDao eventDao;
    private final TeamDao teamDao;
    private final UserDao userDao;
    private final MetricDao metricDao;
    private final MatchDao matchDao;
    private final MatchDataDao matchDataDao;
    private final MatchCommentDao matchCommentDao;
    private final RobotDao robotDao;
    private final RobotEventDao robotEventDao;
    private final PitDataDao pitDataDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        gameDaoConfig = daoConfigMap.get(GameDao.class).clone();
        gameDaoConfig.initIdentityScope(type);

        eventDaoConfig = daoConfigMap.get(EventDao.class).clone();
        eventDaoConfig.initIdentityScope(type);

        teamDaoConfig = daoConfigMap.get(TeamDao.class).clone();
        teamDaoConfig.initIdentityScope(type);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        metricDaoConfig = daoConfigMap.get(MetricDao.class).clone();
        metricDaoConfig.initIdentityScope(type);

        matchDaoConfig = daoConfigMap.get(MatchDao.class).clone();
        matchDaoConfig.initIdentityScope(type);

        matchDataDaoConfig = daoConfigMap.get(MatchDataDao.class).clone();
        matchDataDaoConfig.initIdentityScope(type);

        matchCommentDaoConfig = daoConfigMap.get(MatchCommentDao.class).clone();
        matchCommentDaoConfig.initIdentityScope(type);

        robotDaoConfig = daoConfigMap.get(RobotDao.class).clone();
        robotDaoConfig.initIdentityScope(type);

        robotEventDaoConfig = daoConfigMap.get(RobotEventDao.class).clone();
        robotEventDaoConfig.initIdentityScope(type);

        pitDataDaoConfig = daoConfigMap.get(PitDataDao.class).clone();
        pitDataDaoConfig.initIdentityScope(type);

        gameDao = new GameDao(gameDaoConfig, this);
        eventDao = new EventDao(eventDaoConfig, this);
        teamDao = new TeamDao(teamDaoConfig, this);
        userDao = new UserDao(userDaoConfig, this);
        metricDao = new MetricDao(metricDaoConfig, this);
        matchDao = new MatchDao(matchDaoConfig, this);
        matchDataDao = new MatchDataDao(matchDataDaoConfig, this);
        matchCommentDao = new MatchCommentDao(matchCommentDaoConfig, this);
        robotDao = new RobotDao(robotDaoConfig, this);
        robotEventDao = new RobotEventDao(robotEventDaoConfig, this);
        pitDataDao = new PitDataDao(pitDataDaoConfig, this);

        registerDao(Game.class, gameDao);
        registerDao(Event.class, eventDao);
        registerDao(Team.class, teamDao);
        registerDao(User.class, userDao);
        registerDao(Metric.class, metricDao);
        registerDao(Match.class, matchDao);
        registerDao(MatchData.class, matchDataDao);
        registerDao(MatchComment.class, matchCommentDao);
        registerDao(Robot.class, robotDao);
        registerDao(RobotEvent.class, robotEventDao);
        registerDao(PitData.class, pitDataDao);
    }

    public void clear() {
        gameDaoConfig.getIdentityScope().clear();
        eventDaoConfig.getIdentityScope().clear();
        teamDaoConfig.getIdentityScope().clear();
        userDaoConfig.getIdentityScope().clear();
        metricDaoConfig.getIdentityScope().clear();
        matchDaoConfig.getIdentityScope().clear();
        matchDataDaoConfig.getIdentityScope().clear();
        matchCommentDaoConfig.getIdentityScope().clear();
        robotDaoConfig.getIdentityScope().clear();
        robotEventDaoConfig.getIdentityScope().clear();
        pitDataDaoConfig.getIdentityScope().clear();
    }

    public GameDao getGameDao() {
        return gameDao;
    }

    public EventDao getEventDao() {
        return eventDao;
    }

    public TeamDao getTeamDao() {
        return teamDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public MetricDao getMetricDao() {
        return metricDao;
    }

    public MatchDao getMatchDao() {
        return matchDao;
    }

    public MatchDataDao getMatchDataDao() {
        return matchDataDao;
    }

    public MatchCommentDao getMatchCommentDao() {
        return matchCommentDao;
    }

    public RobotDao getRobotDao() {
        return robotDao;
    }

    public RobotEventDao getRobotEventDao() {
        return robotEventDao;
    }

    public PitDataDao getPitDataDao() {
        return pitDataDao;
    }

}