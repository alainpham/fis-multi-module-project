# Fuse Integration Service Multi Module Project 

This is a Maven archetype that generates a multi module Fuse Integration Service Project. Sometimes you need to be able to share some configuration beans, helper classes or event camel routes between several projects. This achteype helps you setup a multi module Fuse Integration Service project with reusable elements across modules(configuration beans like AMQ connection, helper classes and common camel routes).

## To install the archetype

mvn install

## To use the archetype

mvn archetype:generate -DarchetypeGroupId=techlab -DarchetypeArtifactId=fis-multi-module-project  -DarchetypeVersion=1.0.0 -DgroupId=<yourGrpID> -DartifactId=<yourArtifactID>

