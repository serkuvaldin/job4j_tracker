package ru.job4j.map;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double subjectsCount = 0;
        double scoreSum = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                scoreSum += subject.score();
                subjectsCount++;
            }
        }
        return scoreSum / subjectsCount;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> scores = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double scoreSum = 0;
            for (Subject subject : pupil.subjects()) {
                scoreSum += subject.score();
            }
            scores.add(new Label(pupil.name(), scoreSum / pupil.subjects().size()));
        }
        return scores;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> temp = new LinkedHashMap<>();
        List<Label> scores = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                temp.merge(subject.name(), subject.score(), Integer::sum);
            }
        }
        for (String name : temp.keySet()) {
            scores.add(new Label(name, (double) temp.get(name) / pupils.size()));
        }
        return scores;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> scores = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int scoreSum = 0;
            for (Subject subject : pupil.subjects()) {
                scoreSum += subject.score();
            }
            scores.add(new Label(pupil.name(), scoreSum));
        }
        scores.sort(Comparator.naturalOrder());
        return scores.get(scores.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> temp = new LinkedHashMap<>();
        List<Label> subjects = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                temp.merge(subject.name(), subject.score(), Integer::sum);
            }
        }
        for (String name : temp.keySet()) {
            subjects.add(new Label(name, temp.get(name)));
        }
        subjects.sort(Comparator.naturalOrder());
        return subjects.get(subjects.size() - 1);
    }
}