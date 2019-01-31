/**
 * Copyright 2018 Ahmad. Licensed under the Apache License, Version 2.0
 * See accompanying LICENSE file.
 */
package kafka.manager.utils

import org.apache.curator.test.TestingServer
import org.scalatest.{BeforeAndAfterAll, FunSuite}


/**
 * @author mohaahma
 */
trait ZookeeperServerAwareTest extends FunSuite with BeforeAndAfterAll {

  protected[this] val testServer = new TestingServer()

  override protected def beforeAll(): Unit = {
    super.beforeAll()
    testServer.start()
  }

  override protected def afterAll(): Unit = {
    testServer.stop()
    super.afterAll()
  }

}
