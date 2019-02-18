(ns ^:figwheel-no-load smallworldnew.dev
  (:require
    [smallworldnew.core :as core]
    [devtools.core :as devtools]))

(devtools/install!)

(enable-console-print!)

(core/init!)
