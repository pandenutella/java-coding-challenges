package com.pdn.challenge;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

class LexicographicallyModifiedSorterTest {

    @Test
    void when_sort_should_sort_alphabetically() {
        LexicographicallyModifiedSorter lexicographicallyModifiedSorter = new LexicographicallyModifiedSorter();

        List<String> outputList = lexicographicallyModifiedSorter.sort(asList(
                "sfdf",
                "lpk",
                "zfkhsdnfs",
                "tr",
                "tglown"
        ));

        assertThat(outputList).isEqualTo(asList(
                "lpk",
                "sfdf",
                "tglown",
                "tr",
                "zfkhsdnfs"
        ));
    }

    @Test
    void when_sort_should_move_the_longer_string_up_given_strings_with_the_same_starting_characters() {
        LexicographicallyModifiedSorter lexicographicallyModifiedSorter = new LexicographicallyModifiedSorter();

        List<String> outputList = lexicographicallyModifiedSorter.sort(asList(
                "xxxxx",
                "xxxxxxx",
                "xxxx"
        ));

        assertThat(outputList).isEqualTo(asList(
                "xxxxxxx",
                "xxxxx",
                "xxxx"
        ));
    }
}