(ns lt.plugins.lightgradle
  (:require [lt.object :as object]
            [lt.objs.tabs :as tabs]
            [lt.objs.command :as cmd])
  (:require-macros [lt.macros :refer [defui behavior]]))


(object/object* ::lightgradle
                :tags [:lightgradle]
                :name "lightgradle")


(def hello (object/create ::lightgradle))

