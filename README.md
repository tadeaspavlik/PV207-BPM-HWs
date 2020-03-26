# PV207 - Business Process Management - Homeworks

## About

This repository contains the solution of individual homeworks for subject [PV207](https://is.muni.cz/predmet/fi/jaro2020/PV207) from the [Faculty of Informatics Masaryk University](https://www.fi.muni.cz/index.html.en) in the Spring 2020 semester. Solutions were performed in the [jBPM](https://www.jbpm.org/) toolkit.
## Contents

* [Homework 0](/HW0)
* [Homework 1](/HW1)
* [Homework 2](/HW2)

## Homework 0

This homework is about introduction into jBPM toolkit. The requirement was to create basic process which can be completed manually or can be automated. Solution contains process which has Exclusive Gateway with default route to Manual task (the "manual solution") and the other route to Intermediate Signal. The other route has condition for Process Variable mode that if it is equal to value Drone then the process should choose the other route and be completed the automated way.

## Homework 1

This homework is about modelling a business process using L1 pallete of own choice. Model had to have at least:
* 6+ activities - types are required (user task or service task)
* 2+ gateways
* 3+ events - at least 1 start event and 2+ end events
* 1+ data object connected with an element
* 1+ pool
* 2+ lanes

It was possible to choose business process defined in [team project](https://github.com/binczech/PV207-BPM/). Chosen business process is from said team project and is described in [PDF file](/HW1/Pavlik_bpmn.pdf) which contains solution for this homework.

## Homework 2

This homework is about modelling a business process using L2 pallete of own choice. Model had to have at least: 
* 8+ activities
* 4+ gateways (2 different types)
* 3+ intermediate events (2+ different types)
* 1+ data object
* 2+ text annotations
* 2+ pools, 1 as „blackbox/collapsed pool“, 2+ roles (swimlanes)
* 1+ exception and appropriate handling

It was possible to upgrade the model created in Homework 1 or create a model for a new process. Again it was possible to choose business process defined in [team project](https://github.com/binczech/PV207-BPM/). Chosen business process is from said team project and is described in [PDF file](/HW2/Pavlik_bpmn.pdf) which contains solution for this homework.