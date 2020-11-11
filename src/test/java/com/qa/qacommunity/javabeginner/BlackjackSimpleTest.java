package com.qa.qacommunity.javabeginner;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackjackSimpleTest
{
    int dealer;
    int player;
    int result;

    @Test
    void play_BranchOne()
    {   // Testing both over 21
        dealer = 22;
        player = 22;
        result = BlackjackSimple.play(dealer, player);

        assertEquals(0, result);
    }

    @Test
    void play_BranchTwo()
    {   // Testing only dealer over 21
        dealer = 22;
        player = 21;
        result = BlackjackSimple.play(dealer, player);

        assertEquals(player, result);
    }

    @Test
    void play_BranchThree()
    {   // Testing only player over 21
        dealer = 21;
        player = 22;
        result = BlackjackSimple.play(dealer, player);

        assertEquals(dealer, result);
    }

    @Test
    void play()
    {   // Testing both under 21
        dealer = 21;
        player = 20;
        result = BlackjackSimple.play(dealer, player);

        assertEquals(Math.max(dealer, player), result);
    }
}