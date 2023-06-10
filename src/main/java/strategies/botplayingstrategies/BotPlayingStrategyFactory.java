package strategies.botplayingstrategies;

import models.BotDifficultyLevel;
import strategies.botplayingstrategies.BotPlayingStrategy;
import strategies.botplayingstrategies.EasyBotPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategyForDifficultyLevel(BotDifficultyLevel level) {
        return new EasyBotPlayingStrategy();
    }
}